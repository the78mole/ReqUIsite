# ReqUIsite XML File structure

@startuml "XML Overview"

class "Project Main" as pm
class "Customer Specification" as cs
class "Target Specification" as ts
class "System Specification" as sys
class "Software Specification" as sws
class "Hardware Specification" as hws

pm "1" o-- "1" cs : aggregation
pm "1" o-- "1" ts : aggregation
cs <|-- ts
ts "1" o-- "1" sys : ref >
sys "1" <-- "n" sws : refs >
sys "1" <-- "n" hws : refs >

@enduml
