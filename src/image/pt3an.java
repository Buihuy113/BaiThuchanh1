/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package image;

/**
 *
 * @author duchuy
 */
public class pt3an {
    public static double[] giaiPhuongTrinhBac1BaAn(double a1, double b1, double c1, double d1,
                                                double a2, double b2, double c2, double d2,
                                                double a3, double b3, double c3, double d3) {
    double[] ketQua = new double[3];  // Mảng để chứa nghiệm x, y, z

    double delta = a1 * (b2 * c3 - b3 * c2) - b1 * (a2 * c3 - a3 * c2) + c1 * (a2 * b3 - a3 * b2);

    if (delta == 0) {
        // Nếu delta = 0, phương trình vô nghiệm hoặc có vô số nghiệm
        ketQua[0] = Double.NaN; // Không có nghiệm
        ketQua[1] = Double.NaN; // Không có nghiệm
        ketQua[2] = Double.NaN; // Không có nghiệm
    } else {
        // Tính các định thức của các ma trận con để tính nghiệm x, y, z
        double deltaX = d1 * (b2 * c3 - b3 * c2) - b1 * (d2 * c3 - d3 * c2) + c1 * (d2 * b3 - d3 * b2);
        double deltaY = a1 * (d2 * c3 - d3 * c2) - d1 * (a2 * c3 - a3 * c2) + c1 * (a2 * d3 - a3 * d2);
        double deltaZ = a1 * (b2 * d3 - b3 * d2) - b1 * (a2 * d3 - a3 * d2) + d1 * (a2 * b3 - a3 * b2);

        // Tính nghiệm x, y, z
        ketQua[0] = deltaX / delta;
        ketQua[1] = deltaY / delta;
        ketQua[2] = deltaZ / delta;
    }

    return ketQua;
}

}
