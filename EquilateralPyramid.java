class EquilateralPyramid extends Shape implements Volume {

    // Constructor for Equilateral Pyramid with a square base
    public EquilateralPyramid(double side) {
        super(side, 0, 0); // Only side length is needed; other dimensions are not used
    }

    @Override
    public double calculateArea() {
        // Base Area = side^2
        double baseArea = dim_one * dim_one;

        // Lateral Surface Area = √3 * side^2 (for equilateral pyramid)
        double lateralArea = Math.sqrt(3) * dim_one * dim_one;

        // Total Surface Area = Base Area + Lateral Area
        return baseArea + lateralArea;
    }

    @Override
    public double calculatePerimeter() {
        // Perimeter of the square base = 4 * side
        return 4 * dim_one;
    }

    @Override
    public double calculateVolume() {
        // Volume of an equilateral pyramid = (√2 / 6) * side^3
        return (Math.sqrt(2) / 6) * Math.pow(dim_one, 3);
    }
}

