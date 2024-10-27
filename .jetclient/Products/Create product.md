```toml
name = 'Create product'
method = 'POST'
url = '{{baseUrl}}/products/add'
sortWeight = 3000000
id = 'f7c60c58-6987-481b-96a2-b3b81c9b3243'

[[headers]]
key = 'Authorization'
value = 'Bearer eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhZm9uc28xLm56YW5nb0BnbWFpbC5jb20iLCJpZCI6OSwicm9sZXMiOltdLCJpYXQiOjE3MzAwNjE0OTYsImV4cCI6MTczMDEzMzQ5Nn0.HOPAGw4Ja67ilcgoGDYAHzhWCXBV2GwOqgmYLt1Hh_A'

[body]
type = 'JSON'
raw = '''
{
  "name": "Sample Product",
  "brand": "Sample Brand",
  "price": 29.99,
  "inventory": 100,
  "description": "This is a sample product description.",
  "category": {
    "id": 1,
    "name": "Sample Category"
  }
}
'''
```
