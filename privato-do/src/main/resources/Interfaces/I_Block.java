package Interfaces;

public interface I_Block {
     
    /** Generate the hash for the given block */
  static String generateHashFromBlock( I_Block block){
    
    String originaString = block.getTimestamp() + block.getLastHash() + block.getData();

    String hash = Hashing.sha256()
          .hashString(originaString, StandardCharsets.UTF_8)
          .toString();


    return hash;
  }

  // Generate get methods for Block properties
  public String getTimestamp();
  public String getLastHash();
  public String getData();
  public String getHash();
}
