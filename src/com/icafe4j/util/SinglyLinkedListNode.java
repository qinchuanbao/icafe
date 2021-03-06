/**
 * Copyright (c) 2014-2016 by Wen Yu.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Any modifications to this file must keep this entire header intact.
 */

package com.icafe4j.util;
/**
 * Singly linked list node implementation.
 *
 * @author Wen Yu, yuwen_66@yahoo.com
 * @version 1.0 04/18/2007
 */ 
class SinglyLinkedListNode<E>
{
    int freq;
	E content; 
    SinglyLinkedListNode<E> next; 

    SinglyLinkedListNode(E content,SinglyLinkedListNode<E> next)
    {
        this.freq = 1;
		this.content = content;
        this.next = next;
    }

    SinglyLinkedListNode(E content)
    {
        this(content,null);
    }

    E getValue()
    {
        return content;
    }

    void setValue(E value)
    {
        content = value;
    }

	SinglyLinkedListNode<E> next()
	{
		return next;
	}

	void setNext(SinglyLinkedListNode<E> next)
    {
        this.next = next;
    }
}