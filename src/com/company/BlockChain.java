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
    public void addBlock(String data)
    {
        HashPointer x = new HashPointer();
        x.add = head.add;
        x.hash = head.hash;

        Block temp = new Block(x,data,x.add.getPos() + 1);
        head.add = temp;
        head.hash = temp.getHash();
    }
    public void traverse() {
        Block current = head.add;
        System.out.print("Head:");
        System.out.print(" Hash:" + current.getHash());
        System.out.println(" Data:" + current.getData());

        HashPointer pointer = current.getX();
        while (pointer != null) {
            System.out.println("");
            System.out.println("Current Block: ");
            System.out.println(current);
            System.out.println("Previous Block: ");
            System.out.print("Hash:" + pointer.add.getHash());
            System.out.println(" Data:" + pointer.add.getData());
            current = pointer.add;
            pointer = pointer.add.getX();
        }
    }

}



