/* This file was generated by SableCC (http://www.sablecc.org/). */

package NonNewman.node;

import NonNewman.analysis.*;

public final class TAtribuidor extends Token
{
    public TAtribuidor()
    {
        super.setText("=");
    }

    public TAtribuidor(int line, int pos)
    {
        super.setText("=");
        setLine(line);
        setPos(pos);
    }

    public Object clone()
    {
      return new TAtribuidor(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTAtribuidor(this);
    }

    public void setText(String text)
    {
        throw new RuntimeException("Cannot change TAtribuidor text.");
    }
}
