.class Landroid/support/v4/g/b$1;
.super Landroid/support/v4/g/h;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroid/support/v4/g/b;->b()Landroid/support/v4/g/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/support/v4/g/h",
        "<TE;TE;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Landroid/support/v4/g/b;


# direct methods
.method constructor <init>(Landroid/support/v4/g/b;)V
    .locals 0

    iput-object p1, p0, Landroid/support/v4/g/b$1;->a:Landroid/support/v4/g/b;

    invoke-direct {p0}, Landroid/support/v4/g/h;-><init>()V

    return-void
.end method


# virtual methods
.method protected a()I
    .locals 1

    iget-object v0, p0, Landroid/support/v4/g/b$1;->a:Landroid/support/v4/g/b;

    iget v0, v0, Landroid/support/v4/g/b;->h:I

    return v0
.end method

.method protected a(Ljava/lang/Object;)I
    .locals 1

    iget-object v0, p0, Landroid/support/v4/g/b$1;->a:Landroid/support/v4/g/b;

    invoke-virtual {v0, p1}, Landroid/support/v4/g/b;->a(Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method protected a(II)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Landroid/support/v4/g/b$1;->a:Landroid/support/v4/g/b;

    iget-object v0, v0, Landroid/support/v4/g/b;->g:[Ljava/lang/Object;

    aget-object v0, v0, p1

    return-object v0
.end method

.method protected a(ILjava/lang/Object;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ITE;)TE;"
        }
    .end annotation

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "not a map"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method protected a(I)V
    .locals 1

    iget-object v0, p0, Landroid/support/v4/g/b$1;->a:Landroid/support/v4/g/b;

    invoke-virtual {v0, p1}, Landroid/support/v4/g/b;->c(I)Ljava/lang/Object;

    return-void
.end method

.method protected a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;TE;)V"
        }
    .end annotation

    iget-object v0, p0, Landroid/support/v4/g/b$1;->a:Landroid/support/v4/g/b;

    invoke-virtual {v0, p1}, Landroid/support/v4/g/b;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method protected b(Ljava/lang/Object;)I
    .locals 1

    iget-object v0, p0, Landroid/support/v4/g/b$1;->a:Landroid/support/v4/g/b;

    invoke-virtual {v0, p1}, Landroid/support/v4/g/b;->a(Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method protected b()Ljava/util/Map;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map",
            "<TE;TE;>;"
        }
    .end annotation

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "not a map"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method protected c()V
    .locals 1

    iget-object v0, p0, Landroid/support/v4/g/b$1;->a:Landroid/support/v4/g/b;

    invoke-virtual {v0}, Landroid/support/v4/g/b;->clear()V

    return-void
.end method
