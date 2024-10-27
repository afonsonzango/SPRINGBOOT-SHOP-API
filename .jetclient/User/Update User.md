```toml
name = 'Update User'
method = 'PUT'
url = '{{baseUrl}}/users/{userId}/update'
sortWeight = 3000000
id = 'b4e2aa51-7fd4-411d-96b8-7265a440e729'

[[pathVariables]]
key = 'userId'
value = '8'

[body]
type = 'JSON'
raw = '''
{
  "firstName": "Afonso",
  "lastName": "Nzango",
}'''
```
