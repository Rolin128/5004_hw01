
package project01;

public class Vector3D {
    double x, y, z;

    public Vector3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    public double getZ() {
        return this.z;
    }

    public String toString() {
        return String.format("（ %.2f, %.2f, %.2f）", x, y, z);
    }

    public double getMagnitude() {
        double k = Math.pow(this.x, 2) + Math.pow(this.y, 2) + Math.pow(this.z, 2);
        return Math.sqrt(k);
    }

    public Vector3D normalize() {
        if (this.x == 0 || this.y == 0 || this.z == 0) {
            throw new IllegalArgumentException("can't normalize the vector");
        } else {
            double x_norm = this.x / Math.sqrt(this.x);
            double y_norm = this.x / Math.sqrt(this.y);
            double z_norm = this.x / Math.sqrt(this.z);
            return new Vector3D(x_norm, y_norm, z_norm);
        }
    }

    public Vector3D add(double i, double j, double k) {
        double x_add = this.x + i;
        double y_add = this.y + j;
        double z_add = this.z + k;
        return new Vector3D(x_add, y_add, z_add);

    }

    public Vector3D multiply(double u) {
        return new Vector3D(u*this.x, u*this.y, u*this.z);
    }

    public double dotProduct(double i, double j, double k){
        double m = this.x*i+this.y*j+this.z*k;
        return m;
    }
    public double angleBetween(double h,double j,double r) {

        double k = getMagnitude();
        double f = Math.sqrt(Math.pow(h, 2) + Math.pow(j, 2) + Math.pow(r, 2));
        if (k == 0 || f == 0) {
            throw new IllegalArgumentException("can't normalize the vector");
        } else {
            double m = dotProduct(h, j, r);
            double c = m / (k * f);

            String str_c=String.format("%.1f",c);

            double c_df=Double.parseDouble(str_c);

            System.out.println(c_df);
            return Math.toDegrees(Math.acos(c_df));
        }

    }

    public Vector3D crossProduct(double x1,double y1,double z1){
        double ux=this.y*z1 - this.z*y1;
        double uy=this.z*x1 - this.x*z1;
        double uz=this.x*y1 - this.y*x1;
        return new Vector3D(ux,uy,uz);

    }






}
