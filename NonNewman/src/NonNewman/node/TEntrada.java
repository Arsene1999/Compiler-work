/* This file was generated by SableCC (http://www.sablecc.org/). */

package NonNewman.node;

import NonNewman.analysis.*;

public final class TEntrada extends Token
{
    public TEntrada()
    {
        super.setText("entry");
    }

    public TEntrada(int line, int pos)
    {
        super.setText("entry");
        setLine(line);
        setPos(pos);
    }

    public Object clone()
    {
      return new TEntrada(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTEntrada(this);
    }

    public void setText(String text)
    {
        throw new RuntimeException("Cannot change TEntrada text.");
    }
}
