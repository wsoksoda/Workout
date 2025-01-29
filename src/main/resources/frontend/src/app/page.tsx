import {Button, Center, Grid, Text, VStack,Input} from "@chakra-ui/react";
import WorkoutList from "@/app/components/workoutList";

export default function Home() {
  return (
      <VStack>
      <Center pt={"10vh"}>
        <Text fontSize={"6xl"}>
          Workouts
        </Text>

      </Center>
          <Grid templateColumns="repeat(2, 1fr)" gap={6} m={6}>
              <Input placeholder="Search workouts" />
              <Button>
                  New workout
              </Button>
          </Grid>
          <WorkoutList/>
      </VStack>
  );
}
