.class final Landroid/support/v4/a/c;
.super Landroid/support/v4/a/r;

# interfaces
.implements Landroid/support/v4/a/n$f;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroid/support/v4/a/c$a;
    }
.end annotation


# static fields
.field static final a:Z


# instance fields
.field final b:Landroid/support/v4/a/n;

.field c:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Landroid/support/v4/a/c$a;",
            ">;"
        }
    .end annotation
.end field

.field d:I

.field e:I

.field f:I

.field g:I

.field h:I

.field i:I

.field j:Z

.field k:Z

.field l:Ljava/lang/String;

.field m:Z

.field n:I

.field o:I

.field p:Ljava/lang/CharSequence;

.field q:I

.field r:Ljava/lang/CharSequence;

.field s:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field t:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field u:Z

.field v:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Ljava/lang/Runnable;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    if-lt v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    sput-boolean v0, Landroid/support/v4/a/c;->a:Z

    return-void

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public constructor <init>(Landroid/support/v4/a/n;)V
    .locals 1

    invoke-direct {p0}, Landroid/support/v4/a/r;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroid/support/v4/a/c;->c:Ljava/util/ArrayList;

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroid/support/v4/a/c;->k:Z

    const/4 v0, -0x1

    iput v0, p0, Landroid/support/v4/a/c;->n:I

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroid/support/v4/a/c;->u:Z

    iput-object p1, p0, Landroid/support/v4/a/c;->b:Landroid/support/v4/a/n;

    return-void
.end method

.method private static b(Landroid/support/v4/a/c$a;)Z
    .locals 2

    iget-object v0, p0, Landroid/support/v4/a/c$a;->b:Landroid/support/v4/a/h;

    if-eqz v0, :cond_0

    iget-boolean v1, v0, Landroid/support/v4/a/h;->k:Z

    if-eqz v1, :cond_0

    iget-object v1, v0, Landroid/support/v4/a/h;->H:Landroid/view/View;

    if-eqz v1, :cond_0

    iget-boolean v1, v0, Landroid/support/v4/a/h;->A:Z

    if-nez v1, :cond_0

    iget-boolean v1, v0, Landroid/support/v4/a/h;->z:Z

    if-nez v1, :cond_0

    invoke-virtual {v0}, Landroid/support/v4/a/h;->U()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method


# virtual methods
.method a(Ljava/util/ArrayList;Landroid/support/v4/a/h;)Landroid/support/v4/a/h;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList",
            "<",
            "Landroid/support/v4/a/h;",
            ">;",
            "Landroid/support/v4/a/h;",
            ")",
            "Landroid/support/v4/a/h;"
        }
    .end annotation

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    iget-object v0, p0, Landroid/support/v4/a/c;->c:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v1, v0, :cond_5

    iget-object v0, p0, Landroid/support/v4/a/c;->c:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/a/c$a;

    iget v2, v0, Landroid/support/v4/a/c$a;->a:I

    packed-switch v2, :pswitch_data_0

    :cond_0
    :goto_1
    :pswitch_0
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    :pswitch_1
    iget-object v0, v0, Landroid/support/v4/a/c$a;->b:Landroid/support/v4/a/h;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :pswitch_2
    iget-object v2, v0, Landroid/support/v4/a/c$a;->b:Landroid/support/v4/a/h;

    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    iget-object v2, v0, Landroid/support/v4/a/c$a;->b:Landroid/support/v4/a/h;

    if-ne v2, p2, :cond_0

    iget-object v2, p0, Landroid/support/v4/a/c;->c:Ljava/util/ArrayList;

    new-instance v3, Landroid/support/v4/a/c$a;

    const/16 v4, 0x9

    iget-object v0, v0, Landroid/support/v4/a/c$a;->b:Landroid/support/v4/a/h;

    invoke-direct {v3, v4, v0}, Landroid/support/v4/a/c$a;-><init>(ILandroid/support/v4/a/h;)V

    invoke-virtual {v2, v1, v3}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    add-int/lit8 v1, v1, 0x1

    const/4 p2, 0x0

    goto :goto_1

    :pswitch_3
    iget-object v6, v0, Landroid/support/v4/a/c$a;->b:Landroid/support/v4/a/h;

    iget v7, v6, Landroid/support/v4/a/h;->x:I

    const/4 v4, 0x0

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    move v5, v2

    move-object v3, p2

    move v2, v1

    :goto_2
    if-ltz v5, :cond_3

    invoke-virtual {p1, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/support/v4/a/h;

    iget v8, v1, Landroid/support/v4/a/h;->x:I

    if-ne v8, v7, :cond_6

    if-ne v1, v6, :cond_1

    const/4 v1, 0x1

    :goto_3
    add-int/lit8 v4, v5, -0x1

    move v5, v4

    move v4, v1

    goto :goto_2

    :cond_1
    if-ne v1, v3, :cond_2

    iget-object v3, p0, Landroid/support/v4/a/c;->c:Ljava/util/ArrayList;

    new-instance v8, Landroid/support/v4/a/c$a;

    const/16 v9, 0x9

    invoke-direct {v8, v9, v1}, Landroid/support/v4/a/c$a;-><init>(ILandroid/support/v4/a/h;)V

    invoke-virtual {v3, v2, v8}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    add-int/lit8 v2, v2, 0x1

    const/4 v3, 0x0

    :cond_2
    new-instance v8, Landroid/support/v4/a/c$a;

    const/4 v9, 0x3

    invoke-direct {v8, v9, v1}, Landroid/support/v4/a/c$a;-><init>(ILandroid/support/v4/a/h;)V

    iget v9, v0, Landroid/support/v4/a/c$a;->c:I

    iput v9, v8, Landroid/support/v4/a/c$a;->c:I

    iget v9, v0, Landroid/support/v4/a/c$a;->e:I

    iput v9, v8, Landroid/support/v4/a/c$a;->e:I

    iget v9, v0, Landroid/support/v4/a/c$a;->d:I

    iput v9, v8, Landroid/support/v4/a/c$a;->d:I

    iget v9, v0, Landroid/support/v4/a/c$a;->f:I

    iput v9, v8, Landroid/support/v4/a/c$a;->f:I

    iget-object v9, p0, Landroid/support/v4/a/c;->c:Ljava/util/ArrayList;

    invoke-virtual {v9, v2, v8}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    move v1, v4

    goto :goto_3

    :cond_3
    if-eqz v4, :cond_4

    iget-object v0, p0, Landroid/support/v4/a/c;->c:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    add-int/lit8 v2, v2, -0x1

    :goto_4
    move v1, v2

    move-object p2, v3

    goto/16 :goto_1

    :cond_4
    const/4 v1, 0x1

    iput v1, v0, Landroid/support/v4/a/c$a;->a:I

    invoke-virtual {p1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_4

    :pswitch_4
    iget-object v2, p0, Landroid/support/v4/a/c;->c:Ljava/util/ArrayList;

    new-instance v3, Landroid/support/v4/a/c$a;

    const/16 v4, 0x9

    invoke-direct {v3, v4, p2}, Landroid/support/v4/a/c$a;-><init>(ILandroid/support/v4/a/h;)V

    invoke-virtual {v2, v1, v3}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    add-int/lit8 v1, v1, 0x1

    iget-object p2, v0, Landroid/support/v4/a/c$a;->b:Landroid/support/v4/a/h;

    goto/16 :goto_1

    :cond_5
    return-object p2

    :cond_6
    move v1, v4

    goto :goto_3

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_3
        :pswitch_2
        :pswitch_0
        :pswitch_0
        :pswitch_2
        :pswitch_1
        :pswitch_4
    .end packed-switch
.end method

.method public a()V
    .locals 3

    iget-object v0, p0, Landroid/support/v4/a/c;->v:Ljava/util/ArrayList;

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    iget-object v1, p0, Landroid/support/v4/a/c;->v:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    move v1, v0

    :goto_0
    if-ge v1, v2, :cond_0

    iget-object v0, p0, Landroid/support/v4/a/c;->v:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Runnable;

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Landroid/support/v4/a/c;->v:Ljava/util/ArrayList;

    :cond_1
    return-void
.end method

.method a(I)V
    .locals 6

    iget-boolean v0, p0, Landroid/support/v4/a/c;->j:Z

    if-nez v0, :cond_1

    :cond_0
    return-void

    :cond_1
    sget-boolean v0, Landroid/support/v4/a/n;->a:Z

    if-eqz v0, :cond_2

    const-string v0, "FragmentManager"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Bump nesting in "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " by "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_2
    iget-object v0, p0, Landroid/support/v4/a/c;->c:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v2

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    if-ge v1, v2, :cond_0

    iget-object v0, p0, Landroid/support/v4/a/c;->c:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/a/c$a;

    iget-object v3, v0, Landroid/support/v4/a/c$a;->b:Landroid/support/v4/a/h;

    if-eqz v3, :cond_3

    iget-object v3, v0, Landroid/support/v4/a/c$a;->b:Landroid/support/v4/a/h;

    iget v4, v3, Landroid/support/v4/a/h;->q:I

    add-int/2addr v4, p1

    iput v4, v3, Landroid/support/v4/a/h;->q:I

    sget-boolean v3, Landroid/support/v4/a/n;->a:Z

    if-eqz v3, :cond_3

    const-string v3, "FragmentManager"

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Bump nesting of "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    iget-object v5, v0, Landroid/support/v4/a/c$a;->b:Landroid/support/v4/a/h;

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, " to "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    iget-object v0, v0, Landroid/support/v4/a/c$a;->b:Landroid/support/v4/a/h;

    iget v0, v0, Landroid/support/v4/a/h;->q:I

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_3
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0
.end method

.method a(Landroid/support/v4/a/c$a;)V
    .locals 1

    iget-object v0, p0, Landroid/support/v4/a/c;->c:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget v0, p0, Landroid/support/v4/a/c;->d:I

    iput v0, p1, Landroid/support/v4/a/c$a;->c:I

    iget v0, p0, Landroid/support/v4/a/c;->e:I

    iput v0, p1, Landroid/support/v4/a/c$a;->d:I

    iget v0, p0, Landroid/support/v4/a/c;->f:I

    iput v0, p1, Landroid/support/v4/a/c$a;->e:I

    iget v0, p0, Landroid/support/v4/a/c;->g:I

    iput v0, p1, Landroid/support/v4/a/c$a;->f:I

    return-void
.end method

.method a(Landroid/support/v4/a/h$c;)V
    .locals 3

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    iget-object v0, p0, Landroid/support/v4/a/c;->c:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v1, v0, :cond_1

    iget-object v0, p0, Landroid/support/v4/a/c;->c:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/a/c$a;

    invoke-static {v0}, Landroid/support/v4/a/c;->b(Landroid/support/v4/a/c$a;)Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v0, v0, Landroid/support/v4/a/c$a;->b:Landroid/support/v4/a/h;

    invoke-virtual {v0, p1}, Landroid/support/v4/a/h;->a(Landroid/support/v4/a/h$c;)V

    :cond_0
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    :cond_1
    return-void
.end method

.method public a(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x1

    invoke-virtual {p0, p1, p3, v0}, Landroid/support/v4/a/c;->a(Ljava/lang/String;Ljava/io/PrintWriter;Z)V

    return-void
.end method

.method public a(Ljava/lang/String;Ljava/io/PrintWriter;Z)V
    .locals 5

    if-eqz p3, :cond_8

    invoke-virtual {p2, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mName="

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v0, p0, Landroid/support/v4/a/c;->l:Ljava/lang/String;

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, " mIndex="

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget v0, p0, Landroid/support/v4/a/c;->n:I

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->print(I)V

    const-string v0, " mCommitted="

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v0, p0, Landroid/support/v4/a/c;->m:Z

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->println(Z)V

    iget v0, p0, Landroid/support/v4/a/c;->h:I

    if-eqz v0, :cond_0

    invoke-virtual {p2, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mTransition=#"

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget v0, p0, Landroid/support/v4/a/c;->h:I

    invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, " mTransitionStyle=#"

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget v0, p0, Landroid/support/v4/a/c;->i:I

    invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    :cond_0
    iget v0, p0, Landroid/support/v4/a/c;->d:I

    if-nez v0, :cond_1

    iget v0, p0, Landroid/support/v4/a/c;->e:I

    if-eqz v0, :cond_2

    :cond_1
    invoke-virtual {p2, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mEnterAnim=#"

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget v0, p0, Landroid/support/v4/a/c;->d:I

    invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, " mExitAnim=#"

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget v0, p0, Landroid/support/v4/a/c;->e:I

    invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    :cond_2
    iget v0, p0, Landroid/support/v4/a/c;->f:I

    if-nez v0, :cond_3

    iget v0, p0, Landroid/support/v4/a/c;->g:I

    if-eqz v0, :cond_4

    :cond_3
    invoke-virtual {p2, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mPopEnterAnim=#"

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget v0, p0, Landroid/support/v4/a/c;->f:I

    invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, " mPopExitAnim=#"

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget v0, p0, Landroid/support/v4/a/c;->g:I

    invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    :cond_4
    iget v0, p0, Landroid/support/v4/a/c;->o:I

    if-nez v0, :cond_5

    iget-object v0, p0, Landroid/support/v4/a/c;->p:Ljava/lang/CharSequence;

    if-eqz v0, :cond_6

    :cond_5
    invoke-virtual {p2, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mBreadCrumbTitleRes=#"

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget v0, p0, Landroid/support/v4/a/c;->o:I

    invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, " mBreadCrumbTitleText="

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v0, p0, Landroid/support/v4/a/c;->p:Ljava/lang/CharSequence;

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    :cond_6
    iget v0, p0, Landroid/support/v4/a/c;->q:I

    if-nez v0, :cond_7

    iget-object v0, p0, Landroid/support/v4/a/c;->r:Ljava/lang/CharSequence;

    if-eqz v0, :cond_8

    :cond_7
    invoke-virtual {p2, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mBreadCrumbShortTitleRes=#"

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget v0, p0, Landroid/support/v4/a/c;->q:I

    invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, " mBreadCrumbShortTitleText="

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v0, p0, Landroid/support/v4/a/c;->r:Ljava/lang/CharSequence;

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    :cond_8
    iget-object v0, p0, Landroid/support/v4/a/c;->c:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_d

    invoke-virtual {p2, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "Operations:"

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "    "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    iget-object v0, p0, Landroid/support/v4/a/c;->c:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v3

    const/4 v0, 0x0

    move v2, v0

    :goto_0
    if-ge v2, v3, :cond_d

    iget-object v0, p0, Landroid/support/v4/a/c;->c:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/a/c$a;

    iget v1, v0, Landroid/support/v4/a/c$a;->a:I

    packed-switch v1, :pswitch_data_0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "cmd="

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v4, v0, Landroid/support/v4/a/c$a;->a:I

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    :goto_1
    invoke-virtual {p2, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v4, "  Op #"

    invoke-virtual {p2, v4}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-virtual {p2, v2}, Ljava/io/PrintWriter;->print(I)V

    const-string v4, ": "

    invoke-virtual {p2, v4}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-virtual {p2, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v1, " "

    invoke-virtual {p2, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v1, v0, Landroid/support/v4/a/c$a;->b:Landroid/support/v4/a/h;

    invoke-virtual {p2, v1}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    if-eqz p3, :cond_c

    iget v1, v0, Landroid/support/v4/a/c$a;->c:I

    if-nez v1, :cond_9

    iget v1, v0, Landroid/support/v4/a/c$a;->d:I

    if-eqz v1, :cond_a

    :cond_9
    invoke-virtual {p2, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v1, "enterAnim=#"

    invoke-virtual {p2, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget v1, v0, Landroid/support/v4/a/c$a;->c:I

    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v1, " exitAnim=#"

    invoke-virtual {p2, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget v1, v0, Landroid/support/v4/a/c$a;->d:I

    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2, v1}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    :cond_a
    iget v1, v0, Landroid/support/v4/a/c$a;->e:I

    if-nez v1, :cond_b

    iget v1, v0, Landroid/support/v4/a/c$a;->f:I

    if-eqz v1, :cond_c

    :cond_b
    invoke-virtual {p2, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v1, "popEnterAnim=#"

    invoke-virtual {p2, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget v1, v0, Landroid/support/v4/a/c$a;->e:I

    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v1, " popExitAnim=#"

    invoke-virtual {p2, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget v0, v0, Landroid/support/v4/a/c$a;->f:I

    invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    :cond_c
    add-int/lit8 v0, v2, 0x1

    move v2, v0

    goto/16 :goto_0

    :pswitch_0
    const-string v1, "NULL"

    goto :goto_1

    :pswitch_1
    const-string v1, "ADD"

    goto :goto_1

    :pswitch_2
    const-string v1, "REPLACE"

    goto :goto_1

    :pswitch_3
    const-string v1, "REMOVE"

    goto :goto_1

    :pswitch_4
    const-string v1, "HIDE"

    goto :goto_1

    :pswitch_5
    const-string v1, "SHOW"

    goto/16 :goto_1

    :pswitch_6
    const-string v1, "DETACH"

    goto/16 :goto_1

    :pswitch_7
    const-string v1, "ATTACH"

    goto/16 :goto_1

    :pswitch_8
    const-string v1, "SET_PRIMARY_NAV"

    goto/16 :goto_1

    :pswitch_9
    const-string v1, "UNSET_PRIMARY_NAV"

    goto/16 :goto_1

    :cond_d
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_6
        :pswitch_7
        :pswitch_8
        :pswitch_9
    .end packed-switch
.end method

.method a(Z)V
    .locals 5

    iget-object v0, p0, Landroid/support/v4/a/c;->c:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    move v1, v0

    :goto_0
    if-ltz v1, :cond_2

    iget-object v0, p0, Landroid/support/v4/a/c;->c:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/a/c$a;

    iget-object v2, v0, Landroid/support/v4/a/c$a;->b:Landroid/support/v4/a/h;

    if-eqz v2, :cond_0

    iget v3, p0, Landroid/support/v4/a/c;->h:I

    invoke-static {v3}, Landroid/support/v4/a/n;->d(I)I

    move-result v3

    iget v4, p0, Landroid/support/v4/a/c;->i:I

    invoke-virtual {v2, v3, v4}, Landroid/support/v4/a/h;->a(II)V

    :cond_0
    iget v3, v0, Landroid/support/v4/a/c$a;->a:I

    packed-switch v3, :pswitch_data_0

    :pswitch_0
    new-instance v1, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Unknown cmd: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v0, v0, Landroid/support/v4/a/c$a;->a:I

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :pswitch_1
    iget v3, v0, Landroid/support/v4/a/c$a;->f:I

    invoke-virtual {v2, v3}, Landroid/support/v4/a/h;->a(I)V

    iget-object v3, p0, Landroid/support/v4/a/c;->b:Landroid/support/v4/a/n;

    invoke-virtual {v3, v2}, Landroid/support/v4/a/n;->h(Landroid/support/v4/a/h;)V

    :goto_1
    iget-boolean v3, p0, Landroid/support/v4/a/c;->u:Z

    if-nez v3, :cond_1

    iget v0, v0, Landroid/support/v4/a/c$a;->a:I

    const/4 v3, 0x3

    if-eq v0, v3, :cond_1

    if-eqz v2, :cond_1

    iget-object v0, p0, Landroid/support/v4/a/c;->b:Landroid/support/v4/a/n;

    invoke-virtual {v0, v2}, Landroid/support/v4/a/n;->e(Landroid/support/v4/a/h;)V

    :cond_1
    add-int/lit8 v0, v1, -0x1

    move v1, v0

    goto :goto_0

    :pswitch_2
    iget v3, v0, Landroid/support/v4/a/c$a;->e:I

    invoke-virtual {v2, v3}, Landroid/support/v4/a/h;->a(I)V

    iget-object v3, p0, Landroid/support/v4/a/c;->b:Landroid/support/v4/a/n;

    const/4 v4, 0x0

    invoke-virtual {v3, v2, v4}, Landroid/support/v4/a/n;->a(Landroid/support/v4/a/h;Z)V

    goto :goto_1

    :pswitch_3
    iget v3, v0, Landroid/support/v4/a/c$a;->e:I

    invoke-virtual {v2, v3}, Landroid/support/v4/a/h;->a(I)V

    iget-object v3, p0, Landroid/support/v4/a/c;->b:Landroid/support/v4/a/n;

    invoke-virtual {v3, v2}, Landroid/support/v4/a/n;->j(Landroid/support/v4/a/h;)V

    goto :goto_1

    :pswitch_4
    iget v3, v0, Landroid/support/v4/a/c$a;->f:I

    invoke-virtual {v2, v3}, Landroid/support/v4/a/h;->a(I)V

    iget-object v3, p0, Landroid/support/v4/a/c;->b:Landroid/support/v4/a/n;

    invoke-virtual {v3, v2}, Landroid/support/v4/a/n;->i(Landroid/support/v4/a/h;)V

    goto :goto_1

    :pswitch_5
    iget v3, v0, Landroid/support/v4/a/c$a;->e:I

    invoke-virtual {v2, v3}, Landroid/support/v4/a/h;->a(I)V

    iget-object v3, p0, Landroid/support/v4/a/c;->b:Landroid/support/v4/a/n;

    invoke-virtual {v3, v2}, Landroid/support/v4/a/n;->l(Landroid/support/v4/a/h;)V

    goto :goto_1

    :pswitch_6
    iget v3, v0, Landroid/support/v4/a/c$a;->f:I

    invoke-virtual {v2, v3}, Landroid/support/v4/a/h;->a(I)V

    iget-object v3, p0, Landroid/support/v4/a/c;->b:Landroid/support/v4/a/n;

    invoke-virtual {v3, v2}, Landroid/support/v4/a/n;->k(Landroid/support/v4/a/h;)V

    goto :goto_1

    :pswitch_7
    iget-object v3, p0, Landroid/support/v4/a/c;->b:Landroid/support/v4/a/n;

    const/4 v4, 0x0

    invoke-virtual {v3, v4}, Landroid/support/v4/a/n;->o(Landroid/support/v4/a/h;)V

    goto :goto_1

    :pswitch_8
    iget-object v3, p0, Landroid/support/v4/a/c;->b:Landroid/support/v4/a/n;

    invoke-virtual {v3, v2}, Landroid/support/v4/a/n;->o(Landroid/support/v4/a/h;)V

    goto :goto_1

    :cond_2
    iget-boolean v0, p0, Landroid/support/v4/a/c;->u:Z

    if-nez v0, :cond_3

    if-eqz p1, :cond_3

    iget-object v0, p0, Landroid/support/v4/a/c;->b:Landroid/support/v4/a/n;

    iget-object v1, p0, Landroid/support/v4/a/c;->b:Landroid/support/v4/a/n;

    iget v1, v1, Landroid/support/v4/a/n;->l:I

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Landroid/support/v4/a/n;->a(IZ)V

    :cond_3
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_6
        :pswitch_7
        :pswitch_8
    .end packed-switch
.end method

.method a(Ljava/util/ArrayList;II)Z
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList",
            "<",
            "Landroid/support/v4/a/c;",
            ">;II)Z"
        }
    .end annotation

    const/4 v3, 0x0

    if-ne p3, p2, :cond_0

    move v0, v3

    :goto_0
    return v0

    :cond_0
    iget-object v0, p0, Landroid/support/v4/a/c;->c:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v7

    const/4 v1, -0x1

    move v6, v3

    :goto_1
    if-ge v6, v7, :cond_6

    iget-object v0, p0, Landroid/support/v4/a/c;->c:Ljava/util/ArrayList;

    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/a/c$a;

    iget-object v2, v0, Landroid/support/v4/a/c$a;->b:Landroid/support/v4/a/h;

    if-eqz v2, :cond_1

    iget-object v0, v0, Landroid/support/v4/a/c$a;->b:Landroid/support/v4/a/h;

    iget v2, v0, Landroid/support/v4/a/h;->x:I

    :goto_2
    if-eqz v2, :cond_7

    if-eq v2, v1, :cond_7

    move v5, p2

    :goto_3
    if-ge v5, p3, :cond_5

    invoke-virtual {p1, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/a/c;

    iget-object v1, v0, Landroid/support/v4/a/c;->c:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v8

    move v4, v3

    :goto_4
    if-ge v4, v8, :cond_4

    iget-object v1, v0, Landroid/support/v4/a/c;->c:Ljava/util/ArrayList;

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/support/v4/a/c$a;

    iget-object v9, v1, Landroid/support/v4/a/c$a;->b:Landroid/support/v4/a/h;

    if-eqz v9, :cond_2

    iget-object v1, v1, Landroid/support/v4/a/c$a;->b:Landroid/support/v4/a/h;

    iget v1, v1, Landroid/support/v4/a/h;->x:I

    :goto_5
    if-ne v1, v2, :cond_3

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    move v2, v3

    goto :goto_2

    :cond_2
    move v1, v3

    goto :goto_5

    :cond_3
    add-int/lit8 v1, v4, 0x1

    move v4, v1

    goto :goto_4

    :cond_4
    add-int/lit8 v0, v5, 0x1

    move v5, v0

    goto :goto_3

    :cond_5
    move v0, v2

    :goto_6
    add-int/lit8 v1, v6, 0x1

    move v6, v1

    move v1, v0

    goto :goto_1

    :cond_6
    move v0, v3

    goto :goto_0

    :cond_7
    move v0, v1

    goto :goto_6
.end method

.method public a(Ljava/util/ArrayList;Ljava/util/ArrayList;)Z
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList",
            "<",
            "Landroid/support/v4/a/c;",
            ">;",
            "Ljava/util/ArrayList",
            "<",
            "Ljava/lang/Boolean;",
            ">;)Z"
        }
    .end annotation

    sget-boolean v0, Landroid/support/v4/a/n;->a:Z

    if-eqz v0, :cond_0

    const-string v0, "FragmentManager"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Run: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    invoke-virtual {p1, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-boolean v0, p0, Landroid/support/v4/a/c;->j:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Landroid/support/v4/a/c;->b:Landroid/support/v4/a/n;

    invoke-virtual {v0, p0}, Landroid/support/v4/a/n;->a(Landroid/support/v4/a/c;)V

    :cond_1
    const/4 v0, 0x1

    return v0
.end method

.method b(Ljava/util/ArrayList;Landroid/support/v4/a/h;)Landroid/support/v4/a/h;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList",
            "<",
            "Landroid/support/v4/a/h;",
            ">;",
            "Landroid/support/v4/a/h;",
            ")",
            "Landroid/support/v4/a/h;"
        }
    .end annotation

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    iget-object v0, p0, Landroid/support/v4/a/c;->c:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v1, v0, :cond_0

    iget-object v0, p0, Landroid/support/v4/a/c;->c:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/a/c$a;

    iget v2, v0, Landroid/support/v4/a/c$a;->a:I

    packed-switch v2, :pswitch_data_0

    :goto_1
    :pswitch_0
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    :pswitch_1
    iget-object v0, v0, Landroid/support/v4/a/c$a;->b:Landroid/support/v4/a/h;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    goto :goto_1

    :pswitch_2
    iget-object v0, v0, Landroid/support/v4/a/c$a;->b:Landroid/support/v4/a/h;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :pswitch_3
    iget-object p2, v0, Landroid/support/v4/a/c$a;->b:Landroid/support/v4/a/h;

    goto :goto_1

    :pswitch_4
    const/4 p2, 0x0

    goto :goto_1

    :cond_0
    return-object p2

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
        :pswitch_2
        :pswitch_0
        :pswitch_0
        :pswitch_2
        :pswitch_1
        :pswitch_4
        :pswitch_3
    .end packed-switch
.end method

.method b()V
    .locals 8

    const/4 v7, 0x1

    const/4 v2, 0x0

    iget-object v0, p0, Landroid/support/v4/a/c;->c:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v3

    move v1, v2

    :goto_0
    if-ge v1, v3, :cond_2

    iget-object v0, p0, Landroid/support/v4/a/c;->c:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/a/c$a;

    iget-object v4, v0, Landroid/support/v4/a/c$a;->b:Landroid/support/v4/a/h;

    if-eqz v4, :cond_0

    iget v5, p0, Landroid/support/v4/a/c;->h:I

    iget v6, p0, Landroid/support/v4/a/c;->i:I

    invoke-virtual {v4, v5, v6}, Landroid/support/v4/a/h;->a(II)V

    :cond_0
    iget v5, v0, Landroid/support/v4/a/c$a;->a:I

    packed-switch v5, :pswitch_data_0

    :pswitch_0
    new-instance v1, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Unknown cmd: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v0, v0, Landroid/support/v4/a/c$a;->a:I

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :pswitch_1
    iget v5, v0, Landroid/support/v4/a/c$a;->c:I

    invoke-virtual {v4, v5}, Landroid/support/v4/a/h;->a(I)V

    iget-object v5, p0, Landroid/support/v4/a/c;->b:Landroid/support/v4/a/n;

    invoke-virtual {v5, v4, v2}, Landroid/support/v4/a/n;->a(Landroid/support/v4/a/h;Z)V

    :goto_1
    iget-boolean v5, p0, Landroid/support/v4/a/c;->u:Z

    if-nez v5, :cond_1

    iget v0, v0, Landroid/support/v4/a/c$a;->a:I

    if-eq v0, v7, :cond_1

    if-eqz v4, :cond_1

    iget-object v0, p0, Landroid/support/v4/a/c;->b:Landroid/support/v4/a/n;

    invoke-virtual {v0, v4}, Landroid/support/v4/a/n;->e(Landroid/support/v4/a/h;)V

    :cond_1
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    :pswitch_2
    iget v5, v0, Landroid/support/v4/a/c$a;->d:I

    invoke-virtual {v4, v5}, Landroid/support/v4/a/h;->a(I)V

    iget-object v5, p0, Landroid/support/v4/a/c;->b:Landroid/support/v4/a/n;

    invoke-virtual {v5, v4}, Landroid/support/v4/a/n;->h(Landroid/support/v4/a/h;)V

    goto :goto_1

    :pswitch_3
    iget v5, v0, Landroid/support/v4/a/c$a;->d:I

    invoke-virtual {v4, v5}, Landroid/support/v4/a/h;->a(I)V

    iget-object v5, p0, Landroid/support/v4/a/c;->b:Landroid/support/v4/a/n;

    invoke-virtual {v5, v4}, Landroid/support/v4/a/n;->i(Landroid/support/v4/a/h;)V

    goto :goto_1

    :pswitch_4
    iget v5, v0, Landroid/support/v4/a/c$a;->c:I

    invoke-virtual {v4, v5}, Landroid/support/v4/a/h;->a(I)V

    iget-object v5, p0, Landroid/support/v4/a/c;->b:Landroid/support/v4/a/n;

    invoke-virtual {v5, v4}, Landroid/support/v4/a/n;->j(Landroid/support/v4/a/h;)V

    goto :goto_1

    :pswitch_5
    iget v5, v0, Landroid/support/v4/a/c$a;->d:I

    invoke-virtual {v4, v5}, Landroid/support/v4/a/h;->a(I)V

    iget-object v5, p0, Landroid/support/v4/a/c;->b:Landroid/support/v4/a/n;

    invoke-virtual {v5, v4}, Landroid/support/v4/a/n;->k(Landroid/support/v4/a/h;)V

    goto :goto_1

    :pswitch_6
    iget v5, v0, Landroid/support/v4/a/c$a;->c:I

    invoke-virtual {v4, v5}, Landroid/support/v4/a/h;->a(I)V

    iget-object v5, p0, Landroid/support/v4/a/c;->b:Landroid/support/v4/a/n;

    invoke-virtual {v5, v4}, Landroid/support/v4/a/n;->l(Landroid/support/v4/a/h;)V

    goto :goto_1

    :pswitch_7
    iget-object v5, p0, Landroid/support/v4/a/c;->b:Landroid/support/v4/a/n;

    invoke-virtual {v5, v4}, Landroid/support/v4/a/n;->o(Landroid/support/v4/a/h;)V

    goto :goto_1

    :pswitch_8
    iget-object v5, p0, Landroid/support/v4/a/c;->b:Landroid/support/v4/a/n;

    const/4 v6, 0x0

    invoke-virtual {v5, v6}, Landroid/support/v4/a/n;->o(Landroid/support/v4/a/h;)V

    goto :goto_1

    :cond_2
    iget-boolean v0, p0, Landroid/support/v4/a/c;->u:Z

    if-nez v0, :cond_3

    iget-object v0, p0, Landroid/support/v4/a/c;->b:Landroid/support/v4/a/n;

    iget-object v1, p0, Landroid/support/v4/a/c;->b:Landroid/support/v4/a/n;

    iget v1, v1, Landroid/support/v4/a/n;->l:I

    invoke-virtual {v0, v1, v7}, Landroid/support/v4/a/n;->a(IZ)V

    :cond_3
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_6
        :pswitch_7
        :pswitch_8
    .end packed-switch
.end method

.method b(I)Z
    .locals 5

    const/4 v1, 0x0

    iget-object v0, p0, Landroid/support/v4/a/c;->c:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v3

    move v2, v1

    :goto_0
    if-ge v2, v3, :cond_2

    iget-object v0, p0, Landroid/support/v4/a/c;->c:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/a/c$a;

    iget-object v4, v0, Landroid/support/v4/a/c$a;->b:Landroid/support/v4/a/h;

    if-eqz v4, :cond_0

    iget-object v0, v0, Landroid/support/v4/a/c$a;->b:Landroid/support/v4/a/h;

    iget v0, v0, Landroid/support/v4/a/h;->x:I

    :goto_1
    if-eqz v0, :cond_1

    if-ne v0, p1, :cond_1

    const/4 v0, 0x1

    :goto_2
    return v0

    :cond_0
    move v0, v1

    goto :goto_1

    :cond_1
    add-int/lit8 v0, v2, 0x1

    move v2, v0

    goto :goto_0

    :cond_2
    move v0, v1

    goto :goto_2
.end method

.method c()Z
    .locals 3

    const/4 v2, 0x0

    move v1, v2

    :goto_0
    iget-object v0, p0, Landroid/support/v4/a/c;->c:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v1, v0, :cond_0

    iget-object v0, p0, Landroid/support/v4/a/c;->c:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/a/c$a;

    invoke-static {v0}, Landroid/support/v4/a/c;->b(Landroid/support/v4/a/c$a;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v2, 0x1

    :cond_0
    return v2

    :cond_1
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0
.end method

.method public d()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Landroid/support/v4/a/c;->l:Ljava/lang/String;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const/16 v1, 0x80

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v1, "BackStackEntry{"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Landroid/support/v4/a/c;->n:I

    if-ltz v1, :cond_0

    const-string v1, " #"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Landroid/support/v4/a/c;->n:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    :cond_0
    iget-object v1, p0, Landroid/support/v4/a/c;->l:Ljava/lang/String;

    if-eqz v1, :cond_1

    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroid/support/v4/a/c;->l:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_1
    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
