/* This file was generated by SableCC (http://www.sablecc.org/). */

package NonNewman.node;

import NonNewman.analysis.*;

public final class TTipo extends Token
{
    public TTipo(String text)
    {
        setText(text);
    }

    public TTipo(String text, int line, int pos)
    {
        setText(text);
        setLine(line);
        setPos(pos);
    }

    public Object clone()
    {
      return new TTipo(getText(), getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTTipo(this);
    }
}