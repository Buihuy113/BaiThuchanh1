/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package image;
import java.lang.Math;
import static image.pt2.giai2;

public class pt3 {
    public static double[] giai3(double a, double b, double c, double d) {
    double[] ketQua = new double[3];  // Mảng chứa các nghiệm (tối đa 3 nghiệm)

    if (a == 0) {
        // Nếu a = 0, giải phương trình bậc 2 (sử dụng hàm giai2 đã có)
        double[] ketQua2 = giai2(b, c, d);
        if (Double.isNaN(ketQua2[0])) {
            ketQua[0] = Double.NaN;  // Không có nghiệm
        } else {
            ketQua[0] = ketQua2[0];  // Nghiệm duy nhất
        }
        return ketQua;
    } else {
        // Phương trình bậc 3
        double denta = b * b - 3 * a * c;
        double n = Math.sqrt(Math.abs(denta));
        double k = (9 * a * b * c - 2 * b * b * b - 27 * a * a * d) / (2 * n * n * n);
        
        if (denta > 0) {
            if (Math.abs(k) <= 1) {
                // 3 nghiệm thực
                double phi = Math.acos(k) / 3;
                ketQua[0] = (-b / (3 * a)) + 2 * Math.sqrt(denta) / (3 * a) * Math.cos(phi);
                ketQua[1] = (-b / (3 * a)) + 2 * Math.sqrt(denta) / (3 * a) * Math.cos(phi + 2 * Math.PI / 3);
                ketQua[2] = (-b / (3 * a)) + 2 * Math.sqrt(denta) / (3 * a) * Math.cos(phi + 4 * Math.PI / 3);
            } else {
                // 1 nghiệm thực
                ketQua[0] = (-b / (3 * a)) + Math.signum(k) * Math.pow(Math.abs(k), 1.0 / 3) * (2 * Math.sqrt(denta) / (3 * a));
                ketQua[1] = Double.NaN;
                ketQua[2] = Double.NaN;
            }
        } else if (denta == 0) {
            // Nghiệm kép và một nghiệm đơn
            ketQua[0] = -b / (3 * a);
            ketQua[1] = ketQua[0];
            ketQua[2] = (-b + Math.cbrt(-d / a)) / (3 * a);
        } else {
            // 1 nghiệm thực
            ketQua[0] = (-b / (3 * a)) + Math.cbrt(-d / a);
            ketQua[1] = Double.NaN;
            ketQua[2] = Double.NaN;
        }
    }
    return ketQua;
}

}
