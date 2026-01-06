package org.rahul.BehaviouralPatterns.VisitorPattern;

public interface Document {
    void accept(DocumentVisitor visitor);
}