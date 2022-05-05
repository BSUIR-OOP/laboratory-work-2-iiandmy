//
//  Shape.swift
//  paint-it
//
//  Created by IlyaCool on 28.04.22.
//

import UIKit

class Shape {
    var bezierPath: UIBezierPath!
    var startPoint: CGPoint!
    var size: CGSize!
    
    init(startPoint: CGPoint, size: CGSize) {
        self.startPoint = startPoint
        self.size = size
    }
}
