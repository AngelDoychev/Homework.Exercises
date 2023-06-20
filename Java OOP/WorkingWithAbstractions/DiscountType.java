package JavaOOP.WorkingWithAbstraction.HotelReservations;

public enum DiscountType {
    VIP(20),
    SecondVisit(10),
    None(0);
    private int discount;

    DiscountType(int discountInPercent) {
        this.discount = discountInPercent;
    }

    public int getDiscount() {
        return this.discount;
    }
}
