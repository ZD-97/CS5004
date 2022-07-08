public enum Food {
  BERRIES(0),
  SEEDS(0),
  FRUIT(0),
  INSECTS(0),
  OTHERBIRDS(0),
  EGGS(0),
  SMALLMAMMALS(0),
  FISH(0),
  BUDS(0),
  LARVAE(0),
  AQUATICINVERTEBRATES(0),
  NUTS(0),
  VEGETATION(0);
  private int quantity;
  Food(int quantity) {
    this.quantity = quantity;
  }

  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  public void addQuantity() {
    this.quantity++;
  }

  public static void main(String[] args) {
    StringBuilder sb = new StringBuilder();
    for(Food f:Food.values()) {
      sb.append(f);
      sb.append(": ");
      sb.append(f.getQuantity());
      sb.append("\n");
    }
    System.out.println(sb.toString());
  }
}
