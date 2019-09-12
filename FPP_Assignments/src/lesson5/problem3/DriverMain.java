package lesson5.problem3;

public class DriverMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Figure[] figures = {new UpwardHat(), new UpwardHat(), new DownwardHat(), new FaceMaker(), new Vertical()};
		
		for(Figure fig : figures)
		{
			fig.getFigure();
		}
		
		for(Figure fig : figures)
		{
			System.out.println();
			System.out.print(fig.getClass().getSimpleName() + ": ");
			fig.getFigure();
		}
	}

}
