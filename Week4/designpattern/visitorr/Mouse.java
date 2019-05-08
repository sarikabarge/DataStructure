package com.bridgeit.designpattern.visitorr;
	public class Mouse implements ComputerPart {

		public void accept(ComputerPartVisitor computerpartvisitor)
		{
			computerpartvisitor.visit(this);
		}
	}

