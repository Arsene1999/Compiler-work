/* This file was generated by SableCC (http://www.sablecc.org/). */

package NonNewman.node;

import NonNewman.analysis.*;

public final class TMaior extends Token
{
    public TMaior()
    {
        super.setText(">");
    }

    public TMaior(int line, int pos)
    {
        super.setText(">");
        setLine(line);
        setPos(pos);
    }

    public Object clone()
    {
      return new TMaior(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTMaior(this);
    }

    public void setText(String text)
    {
        throw new RuntimeException("Cannot change TMaior text.");
    }
}
