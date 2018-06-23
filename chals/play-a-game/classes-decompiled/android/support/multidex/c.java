// 
// Decompiled by Procyon v0.5.30
// 

package android.support.multidex;

import java.util.zip.ZipException;
import java.util.zip.CRC32;
import java.io.RandomAccessFile;
import java.io.File;

final class c
{
    static long a(File file) {
        file = (File)new RandomAccessFile(file, "r");
        try {
            return a((RandomAccessFile)file, a((RandomAccessFile)file));
        }
        finally {
            ((RandomAccessFile)file).close();
        }
    }
    
    static long a(final RandomAccessFile randomAccessFile, final a a) {
        final CRC32 crc32 = new CRC32();
        long b = a.b;
        randomAccessFile.seek(a.a);
        final int n = (int)Math.min(16384L, b);
        final byte[] array = new byte[16384];
        for (int i = randomAccessFile.read(array, 0, n); i != -1; i = randomAccessFile.read(array, 0, (int)Math.min(16384L, b))) {
            crc32.update(array, 0, i);
            b -= i;
            if (b == 0L) {
                break;
            }
        }
        return crc32.getValue();
    }
    
    static a a(final RandomAccessFile randomAccessFile) {
        long n = 0L;
        long n2 = randomAccessFile.length() - 22L;
        if (n2 < 0L) {
            throw new ZipException("File too short to be a zip file: " + randomAccessFile.length());
        }
        final long n3 = n2 - 65536L;
        if (n3 >= 0L) {
            n = n3;
        }
        final int reverseBytes = Integer.reverseBytes(101010256);
        do {
            randomAccessFile.seek(n2);
            if (randomAccessFile.readInt() == reverseBytes) {
                randomAccessFile.skipBytes(2);
                randomAccessFile.skipBytes(2);
                randomAccessFile.skipBytes(2);
                randomAccessFile.skipBytes(2);
                final a a = new a();
                a.b = (Integer.reverseBytes(randomAccessFile.readInt()) & 0xFFFFFFFFL);
                a.a = (Integer.reverseBytes(randomAccessFile.readInt()) & 0xFFFFFFFFL);
                return a;
            }
        } while (--n2 >= n);
        throw new ZipException("End Of Central Directory signature not found");
    }
    
    static class a
    {
        long a;
        long b;
    }
}
