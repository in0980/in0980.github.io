import sys

def parse_config(filename):
    configs = []
    with open(filename, "r") as file:
        lines = file.readlines()
        config = {}
        for line in lines:
            line = line.strip()
            if not line: # Empty line
                if config:
                    configs.append(config)
                    config = {}
                continue
            if line.startswith("#"): # Comment
                continue
            elif line.startswith("-----"): # Configuration separator
                continue
            elif line.startswith("Configuration"):
                continue
            else: # Configuration parameter with its value
                parts = line.split()
                keyval = parts[2]
                keyval_parts = keyval.split("=")
                key = keyval_parts[0]
                val = keyval_parts[1]
                config[key] = val
    return configs

def main():
    configs = parse_config("output.txt")
    # Run code for all configs
    for config in configs:
        print("config {}".format(config))

if __name__ == "__main__":
    main()
    