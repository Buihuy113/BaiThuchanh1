/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package image;

/**
 *
 * @author duchuy
 */
public class pt2an {
    public static double[] giaiPhuongTrinhBac1HaiAn(double a1, double b1, double c1, double a2, double b2, double c2) {
    double[] ketQua = new double[2];  // Mảng để chứa nghiệm x và y
    
    double delta = a1 * b2 - a2 * b1;

    if (delta == 0) {
        // Nếu delta = 0, phương trình có thể vô nghiệm hoặc có vô số nghiệm
        ketQua[0] = Double.NaN; // Không có nghiệm
        ketQua[1] = Double.NaN; // Không có nghiệm
    } else {
        // Tính nghiệm x và y
        double x = (c1 * b2 - c2 * b1) / delta;
        double y = (a1 * c2 - a2 * c1) / delta;
        
        ketQua[0] = x;
        ketQua[1] = y;
    }
    
    return ketQua;
}

}
