//
//  DrawPanel.swift
//  paint-it
//
//  Created by IlyaCool on 28.04.22.
//

import UIKit

class DrawPanel: UIView {

    var firstPoint: CGPoint!
    var secondPoint: CGPoint!
    var isDrawing: Bool = false
    var isDrag: Bool = false
    
    override func touchesBegan(_ touches: Set<UITouch>, with event: UIEvent?) {
        firstPoint = touches.first?.location(in: self)
        print("began")
    }
    
    override func touchesMoved(_ touches: Set<UITouch>, with event: UIEvent?) {
        _ = touches.first?.location(in: self)
        print("moved")
    }
    
    override func touchesEnded(_ touches: Set<UITouch>, with event: UIEvent?) {
        secondPoint = touches.first?.location(in: self)
        print("ended")
    }
    
    private func getStartPoint(firstPoint: CGPoint, secondPoint: CGPoint) -> CGPoint {
        return CGPoint(x: min(firstPoint.x, secondPoint.x),
                       y: min(firstPoint.y, secondPoint.y))
    }

}
