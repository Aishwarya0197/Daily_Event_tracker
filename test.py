def add(a, b):
    return a + b

def main():
    print("Hello from Jenkins!")

    result = add(10, 20)
    assert result == 30, "Addition test failed!"

    print("Test passed!")
    print("Result:", result)

if __name__ == "__main__":
    main()
