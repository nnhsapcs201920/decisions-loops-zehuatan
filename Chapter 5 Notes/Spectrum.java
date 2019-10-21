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
            System.out.println("Radio Waves: frequency < 3x10^9");
        }
        else if (wavelength < 1e-1 && wavelength > 1e-3)
        {
            System.out.println("Microwaves: frequency between 3x10^9 and 3x10^11");
        }
        else if (wavelength < 1e-3 && wavelength > 7e-7)
        {
            System.out.println("Infrared: frequency between 3x10^11 and 4x10^14");
        }
        else if (wavelength < 7e-7 && wavelength > 4e-7)
        {
            System.out.println("Visible light: frequency between 4x10^13 and 7.5x10^14");
        }
        else if (wavelength < 4e-7 && wavelength > 1e-8)
        {
            System.out.println("Ultraviolet: frequency bewteen 7.5x10^14 and 3x10^16");
        }
        else if (wavelength < 10e-8 && wavelength > 10e-11)
        {
            System.out.println("Xrays: frequency bewteen 3x10^16 and 3x10^19");
        }
        else if (wavelength < 10e-11)
        {
            System.out.println("Gamma rays: frequency > 3x10^19");
        }
        
    }
}