package com.bridgeit.designpattern.visitor;

public interface ShoppingCartVisitor {

	int visit(Book book);
	int visit(Fruit fruit);
}