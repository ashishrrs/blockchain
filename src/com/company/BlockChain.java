package com.company;

public class BlockChain {
private HashPointer head;

    public HashPointer getHead() {
        return head;
    }
    BlockChain(String data)
    {
        head = new HashPointer();
        head.add = new Block(null,data,0);
        head.hash = head.add.getHash();
    }

}
