public class overloaded {
        private double a;
        private double b;

    overloaded()
        {
            a = 1;
            b = 1;
        }

        double GetA() { return a; }
        double GetB() { return b; }
        void SetComplex(double a, double b)
        {
            this.a = a;
            this.b = b;
        }

    overloaded Mult()
        {
            overloaded c = new overloaded();
            double A, B;

            A = a*a - b*b;
            B = a*b + b*a;

            c.SetComplex(A, B);
            return c;
        }

    overloaded Mult(double d)
        {
            overloaded c = new overloaded();
            double A, B;

            A = a*d;
            B = b*d;
            c.SetComplex(A, B);

            return c;
        }

      overloaded Mult(double a2, double b2)
        {
            overloaded c = new overloaded();
            double A, B;

            A = a*a2 - b*b2;
            B = a*b2 + b*a2;
            c.SetComplex(A, B);

            return  c;
        }
}
