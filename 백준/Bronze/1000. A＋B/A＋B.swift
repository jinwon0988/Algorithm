import Foundation

if let line = readLine() {
    let parts = line.split(separator: " ")
    if parts.count == 2,
        let a = Int(parts[0]),
        let b = Int(parts[1]) {
            print(a+b)
        }
}