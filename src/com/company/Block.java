package com.company;

public class Block {
    private HashPointer x;
    private String data;
    private int pos;

    public void setX(HashPointer x) {
        this.x = x;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setPos(int pos) {
        this.pos = pos;
    }


    public HashPointer getX() {
        return x;
    }

    public String getData() {

        return data;
    }

    public int getPos() {
        return pos;
    }

    Block(HashPointer prev, String data, int pos)
    {
        this.x = prev;
        this.data = data;
        this.pos = pos;
    }
    @Override
    public String toString()
    {
         return new StringBuilder("Hash: ").append(this.getHash()).append(" Data: ").append(this.data).toString();
    }
    public String getHash()
    {
        String content;
        if(x != null)
             content = new StringBuilder(x.hash).append(this.data).toString();
        else
            content = this.data;
        return Tools.getSHA2HexValue(content);
    }

}
