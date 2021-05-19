package com.company;

public class Main {

    public static void main(String[] args) {
        BlockChain blockChain = new BlockChain("genesis");
        blockChain.addBlock("block1");
        blockChain.addBlock("block2");
        blockChain.addBlock("block3");
        blockChain.addBlock("block4");
        blockChain.addBlock("block5");
        blockChain.traverse();
    }
}
