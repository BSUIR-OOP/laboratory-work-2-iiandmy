//
//  ViewController.swift
//  paint-it
//
//  Created by IlyaCool on 20.04.22.
//

import UIKit

protocol PaintViewProtocol {
    func draw(shape: Shape)
}

class PaintViewController: UIViewController {
    
    let pickerContent: [String] = [ "Circle", "Rectangle", "Triangle" ]
    
    @IBOutlet weak var pickerView: UIPickerView!
    @IBOutlet weak var paintButton: UIButton!
    @IBOutlet weak var drawPanel: DrawPanel!
    
    var choosedShape: String? {
        didSet {
            print(choosedShape!)
        }
    }
    
    override func viewDidLoad() {
        super.viewDidLoad()
        
        setupPicker()
    }
    
}

// MARK: UI Components Setup
extension PaintViewController {
    func setupPicker() {
        pickerView?.dataSource = self
        pickerView?.delegate = self
    }
}

extension PaintViewController: UIPickerViewDelegate {
    func pickerView(_ pickerView: UIPickerView, titleForRow row: Int, forComponent component: Int) -> String? {
        return pickerContent[row]
    }
    
    func pickerView(_ pickerView: UIPickerView, didSelectRow row: Int, inComponent component: Int) {
        choosedShape = pickerContent[row]
    }
}

extension PaintViewController: UIPickerViewDataSource {
    func pickerView(_ pickerView: UIPickerView, numberOfRowsInComponent component: Int) -> Int {
        return pickerContent.count
    }
    
    func numberOfComponents(in pickerView: UIPickerView) -> Int {
        1
    }
}

//        let myView = MyView()
//        myView.backgroundColor = view.backgroundColor
//        myView.frame.size = CGSize(width: 100, height: 200)
//        myView.frame.origin = CGPoint(x: 1, y: 50)
//        view.addSubview(myView)
        
//        myView.draw(Triangle())

//class MyView: UIView {
//    private var path: UIBezierPath?
//
//    override func draw(_ rect: CGRect) {
//
//        path?.lineWidth = 3
//        UIColor.red.setStroke()
//        path?.stroke()
//    }
//
//    func draw(_ shape: Shape) {
//        path = shape.path(frame.size)
//        setNeedsDisplay()
//    }
//}
