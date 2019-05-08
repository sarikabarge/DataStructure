package com.bridgeit.designpattern.visitorr;
public class Keyboard implements ComputerPart {

	public void accept(ComputerPartVisitor computerpartvisitor)
	{
		computerpartvisitor.visit(this);
	}
}
