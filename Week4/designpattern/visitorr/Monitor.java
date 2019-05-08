package com.bridgeit.designpattern.visitorr;

public class Monitor implements ComputerPart {

	public void accept(ComputerPartVisitor computerpartvisitor)
	{
		computerpartvisitor.visit(this);
	}
}
