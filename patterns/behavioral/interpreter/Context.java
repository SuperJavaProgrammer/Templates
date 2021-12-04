package behavioral.interpreter;

class Context {
    Expression evaluate(String s) {
        int pos = s.length() - 1;
        while (pos > 0) {
            if (Character.isDigit(s.charAt(pos))) pos--;
            else {
                Expression left = evaluate(s.substring(0, pos));
                Expression right = new NumberExpression(Integer.valueOf(s.substring(pos + 1), s.length()));
                char operator = s.charAt(pos);
                return (operator + "").equals("-") ? new MinusExpression(left, right) : new PlusExpression(left, right);
            }
        }
        int result = Integer.parseInt(s);
        return new NumberExpression(result);
    }
}
