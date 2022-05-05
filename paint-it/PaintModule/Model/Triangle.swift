//
//  Triangle.swift
//  paint-it
//
//  Created by IlyaCool on 28.04.22.
//

import UIKit

class Triangle: Shape {
    
    override init(startPoint: CGPoint, size: CGSize) {
        super.init(startPoint: startPoint, size: size)
        
        self.bezierPath = buildBezier()
    }
    
    // MARK: Magic numbers
    // X = 1 and Y = 1 setted shape to begin in left top of superview
    // Substracted height and width to avoid out of bounds
    private func buildBezier() -> UIBezierPath {
        let path = UIBezierPath()
        path.move(to: CGPoint(x: 1, y: size.height - 1))
        path.addLine(to: CGPoint(x: size.width - 1, y: size.height - 1))
        path.addLine(to: CGPoint(x: size.width / 2, y: 1))
        path.close()
        
        return path
    }
    
}
