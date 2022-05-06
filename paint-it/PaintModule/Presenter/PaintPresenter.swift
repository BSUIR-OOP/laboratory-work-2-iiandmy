//
//  PaintPresenter.swift
//  paint-it
//
//  Created by IlyaCool on 6.05.22.
//

import Foundation

protocol PaintPresenterProtocol {
    func getShape() -> Shape
}

class PaintPresenter: PaintPresenterProtocol {
    
    let view: PaintViewProtocol?
    
    func getShape() -> Shape {
        
    }
    
}

//class PaintPresenter: PaintPresenterProtocol {
//    let view: PaintViewProtocol?
//    
//
//}
