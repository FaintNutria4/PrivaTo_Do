package Interfaces;

public class I_Blockchain {
    /** Adds new block to blockchain */
  addBlock(block: Block): Block
  /**
   * Validates the chain by checking if:
   * - every element's last hash value matches previous block's hash
   * - data hasn't been tampered (which will produce a different hash value)
   */
  isValid(blockchain: Blockchain): boolean
  /** The new blockchain that is a candidate for replacing the current blockchain */
  replace(blockchain: Blockchain): boolean
}
