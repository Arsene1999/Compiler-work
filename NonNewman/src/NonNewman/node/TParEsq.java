/* This file was generated by SableCC (http://www.sablecc.org/). */

package NonNewman.node;

import NonNewman.analysis.*;

public final class TParEsq extends Token
{
    public TParEsq()
    {
        super.setText("(");
    }

    public TParEsq(int line, int pos)
    {
        super.setText("(");
        setLine(line);
        setPos(pos);
    }

    public Object clone()
    {
      return new TParEsq(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTParEsq(this);
    }

    public void setText(String text)
    {
        throw new RuntimeException("Cannot change TParEsq text.");
    }
}
