.class public Landroid/support/v4/h/m;
.super Ljava/lang/Object;


# instance fields
.field private final a:Landroid/view/ViewGroup;

.field private b:I


# direct methods
.method public constructor <init>(Landroid/view/ViewGroup;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroid/support/v4/h/m;->a:Landroid/view/ViewGroup;

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    iget v0, p0, Landroid/support/v4/h/m;->b:I

    return v0
.end method

.method public a(Landroid/view/View;)V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Landroid/support/v4/h/m;->a(Landroid/view/View;I)V

    return-void
.end method

.method public a(Landroid/view/View;I)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Landroid/support/v4/h/m;->b:I

    return-void
.end method

.method public a(Landroid/view/View;Landroid/view/View;I)V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, p3, v0}, Landroid/support/v4/h/m;->a(Landroid/view/View;Landroid/view/View;II)V

    return-void
.end method

.method public a(Landroid/view/View;Landroid/view/View;II)V
    .locals 0

    iput p3, p0, Landroid/support/v4/h/m;->b:I

    return-void
.end method
