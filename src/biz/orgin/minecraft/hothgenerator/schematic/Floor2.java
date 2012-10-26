package biz.orgin.minecraft.hothgenerator.schematic;

public class Floor2  implements Schematic
{
	public static Schematic instance = new Floor2();
	private static int WIDTH = 7;
	private static int LENGTH = 7;
	private static int HEIGHT = 1;
	private static String name = "Floor2";
	
	private final int[][][] matrix = new int[][][]
	{
		    //   TYPEID                       DATAID
		{   // Layer 0
			{ 98, 98, 98, 98, 98, 98, 98,   3, 3, 3, 3, 3, 3, 3},
			{ 98, 43, 43, 43, 43, 43, 98,   3, 0, 0, 0, 0, 0, 3},
			{ 98, 43, 98, 98, 98, 43, 98,   3, 0, 0, 0, 0, 0, 3},
			{ 98, 43, 98, 98, 98, 43, 98,   3, 0, 0, 0, 0, 0, 3},
			{ 98, 43, 98, 98, 98, 43, 98,   3, 0, 0, 0, 0, 0, 3},
			{ 98, 43, 43, 43, 43, 43, 98,   3, 0, 0, 0, 0, 0, 3},
			{ 98, 98, 98, 98, 98, 98, 98,   3, 3, 3, 3, 3, 3, 3}
		},
	};
	
	private Floor2()
	{
	}
	
	public int getWidth() // Inner
	{
		return Floor2.WIDTH;
	}
	public int getLength() // Middle
	{
		return Floor2.LENGTH;
	}
	public int getHeight() // Outer
	{
		return Floor2.HEIGHT;
	}
	
	public int[][][] getMatrix()
	{
		return this.matrix;
	}

	@Override
	public String getName()
	{
		return Floor2.name;
	}
}