import java.util.Scanner;

public class Spectrum
{
    public void findWaveType()
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter a wavelength: ");
        long wavelength = scan.nextInt();
        if (wavelength > 1e-1)
        {
            System.out.println("Radio Waves");
        }
        else if (wavelength < 1e-1 && wavelength > 1e-3)
        {
        }
    }
}