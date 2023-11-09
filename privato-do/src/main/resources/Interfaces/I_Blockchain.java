package Interfaces;

interface I_Blockchain {
    /** Adds new block to blockchain */
  Public I_Block addBlock(I_Block block);
  /**
   * Validates the chain by checking if:
   * - every element's last hash value matches previous block's hash
   * - data hasn't been tampered (which will produce a different hash value)
   */
  Public Boolean isValid(I_Blockchain blockchain);
  /** The new blockchain that is a candidate for replacing the current blockchain */
  Public Boolean replace(I_Blockchain blockchain );
}
