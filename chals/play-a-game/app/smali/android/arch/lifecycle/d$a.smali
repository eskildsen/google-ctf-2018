.class Landroid/arch/lifecycle/d$a;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/arch/lifecycle/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation


# instance fields
.field a:Landroid/arch/lifecycle/b$b;

.field b:Landroid/arch/lifecycle/a;


# virtual methods
.method a(Landroid/arch/lifecycle/c;Landroid/arch/lifecycle/b$a;)V
    .locals 2

    invoke-static {p2}, Landroid/arch/lifecycle/d;->b(Landroid/arch/lifecycle/b$a;)Landroid/arch/lifecycle/b$b;

    move-result-object v0

    iget-object v1, p0, Landroid/arch/lifecycle/d$a;->a:Landroid/arch/lifecycle/b$b;

    invoke-static {v1, v0}, Landroid/arch/lifecycle/d;->a(Landroid/arch/lifecycle/b$b;Landroid/arch/lifecycle/b$b;)Landroid/arch/lifecycle/b$b;

    move-result-object v1

    iput-object v1, p0, Landroid/arch/lifecycle/d$a;->a:Landroid/arch/lifecycle/b$b;

    iget-object v1, p0, Landroid/arch/lifecycle/d$a;->b:Landroid/arch/lifecycle/a;

    invoke-interface {v1, p1, p2}, Landroid/arch/lifecycle/a;->a(Landroid/arch/lifecycle/c;Landroid/arch/lifecycle/b$a;)V

    iput-object v0, p0, Landroid/arch/lifecycle/d$a;->a:Landroid/arch/lifecycle/b$b;

    return-void
.end method
