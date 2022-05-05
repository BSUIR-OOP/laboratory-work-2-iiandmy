//
//  Rectangle.swift
//  paint-it
//
//  Created by IlyaCool on 28.04.22.
//

import CoreGraphics
import UIKit

class Rectangle: Shape {
    
    override init(startPoint: CGPoint, size: CGSize) {
        super.init(startPoint: startPoint, size: size)
        
        self.bezierPath = buildBezier()
    }
    
    // MARK: Magic numbers
    // X = 1 and Y = 1 setted shape to begin in left top of superview
    // Width - 2 and Height - 2 to avoid out of bounds from both sides (1 pixel each side)
    private func buildBezier() -> UIBezierPath {
        return UIBezierPath(rect: CGRect(x: 1, y: 1, width: size.width - 2, height: size.height - 2))
    }
    
}

