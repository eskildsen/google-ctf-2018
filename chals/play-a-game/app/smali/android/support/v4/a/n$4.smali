.class Landroid/support/v4/a/n$4;
.super Landroid/animation/AnimatorListenerAdapter;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroid/support/v4/a/n;->d(Landroid/support/v4/a/h;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/view/ViewGroup;

.field final synthetic b:Landroid/view/View;

.field final synthetic c:Landroid/support/v4/a/h;

.field final synthetic d:Landroid/support/v4/a/n;


# direct methods
.method constructor <init>(Landroid/support/v4/a/n;Landroid/view/ViewGroup;Landroid/view/View;Landroid/support/v4/a/h;)V
    .locals 0

    iput-object p1, p0, Landroid/support/v4/a/n$4;->d:Landroid/support/v4/a/n;

    iput-object p2, p0, Landroid/support/v4/a/n$4;->a:Landroid/view/ViewGroup;

    iput-object p3, p0, Landroid/support/v4/a/n$4;->b:Landroid/view/View;

    iput-object p4, p0, Landroid/support/v4/a/n$4;->c:Landroid/support/v4/a/h;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 2

    iget-object v0, p0, Landroid/support/v4/a/n$4;->a:Landroid/view/ViewGroup;

    iget-object v1, p0, Landroid/support/v4/a/n$4;->b:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->endViewTransition(Landroid/view/View;)V

    invoke-virtual {p1, p0}, Landroid/animation/Animator;->removeListener(Landroid/animation/Animator$AnimatorListener;)V

    iget-object v0, p0, Landroid/support/v4/a/n$4;->c:Landroid/support/v4/a/h;

    iget-object v0, v0, Landroid/support/v4/a/h;->H:Landroid/view/View;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v4/a/n$4;->c:Landroid/support/v4/a/h;

    iget-object v0, v0, Landroid/support/v4/a/h;->H:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    :cond_0
    return-void
.end method
