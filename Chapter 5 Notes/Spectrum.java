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
        else if (wavelength < 1e-3 && wavelength > 7e-7)
        {
        }
        else if (wavelength < 7e-7 && wavelength > 4e-7)
        {
        }
        else if (wavelength < 4e-7 && wavelength > 1e-8)
        {
        }
        
    }
}