public class Addition extends  BinaryExpression{
//    private Expression left;
//    private Expression right;
    public Addition(Expression l, Expression r){
        left = l;
        right = r;
    }

    public Expression getLeft() {
        return left;
    }

    public void setLeft(Expression left) {
        this.left = left;
    }

    public Expression getRight() {
        return right;
    }

    public void setRight(Expression right) {
        this.right = right;
    }

    @Override
    public int evaluate() {
        return left.evaluate() + right.evaluate() ;
    }

    @Override
    public String toString() {
        return ""+  left.toString() + " + " + right.toString()  +"";
    }

    @Override
    public Expression left() {
        return left;
    }

    @Override
    public Expression right() {
        return right;
    }
}
