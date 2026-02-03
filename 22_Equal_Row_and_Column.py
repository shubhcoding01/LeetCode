class Solution:
    def equalPairs(self, grid: List[List[int]]) -> int:
        n = len(grid)

        row_map= {}

        for row in grid:
            row_tuple = tuple(row)
            row_map[row_tuple] = row_map.get(row_tuple,0)+1

        count = 0

        for col in range(n):
            column= []
            for row in range(n):
                column.append(grid[row][col])

            col_tuple = tuple(column)

            if col_tuple in row_map:
                count += row_map[col_tuple]

        return count