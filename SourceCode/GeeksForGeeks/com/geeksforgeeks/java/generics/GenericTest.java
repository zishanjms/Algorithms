package com.geeksforgeeks.java.generics;

public class GenericTest<R extends Base1Class, A extends Base2Class, B extends Base3Class>
{
	public R transform(A a, B b)
	{
		return ((R)(new Base1Class()));
	}
	
}


class Base1Class
{
	
}

class Base2Class
{
}

class Base3Class
{
}
