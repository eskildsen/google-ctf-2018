.class Landroid/arch/a/a/b$a;
.super Landroid/arch/a/a/b$e;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/arch/a/a/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "Landroid/arch/a/a/b$e",
        "<TK;TV;>;"
    }
.end annotation


# direct methods
.method constructor <init>(Landroid/arch/a/a/b$c;Landroid/arch/a/a/b$c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/arch/a/a/b$c",
            "<TK;TV;>;",
            "Landroid/arch/a/a/b$c",
            "<TK;TV;>;)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Landroid/arch/a/a/b$e;-><init>(Landroid/arch/a/a/b$c;Landroid/arch/a/a/b$c;)V

    return-void
.end method


# virtual methods
.method a(Landroid/arch/a/a/b$c;)Landroid/arch/a/a/b$c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/arch/a/a/b$c",
            "<TK;TV;>;)",
            "Landroid/arch/a/a/b$c",
            "<TK;TV;>;"
        }
    .end annotation

    iget-object v0, p1, Landroid/arch/a/a/b$c;->c:Landroid/arch/a/a/b$c;

    return-object v0
.end method
